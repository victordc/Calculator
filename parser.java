
//----------------------------------------------------
// The following code was generated by CUP v0.10k
// Wed Feb 03 01:40:54 UTC 2016
//----------------------------------------------------

package Calculator;

import java_cup.runtime.*;

/** CUP v0.10k generated parser.
  * @version Wed Feb 03 01:40:54 UTC 2016
  */
public class parser extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\040\000\002\003\004\000\002\002\004\000\002\003" +
    "\004\000\002\003\003\000\002\003\003\000\002\010\002" +
    "\000\002\004\005\000\002\011\002\000\002\005\005\000" +
    "\002\007\003\000\002\007\004\000\002\007\005\000\002" +
    "\007\005\000\002\007\005\000\002\007\005\000\002\007" +
    "\005\000\002\007\005\000\002\006\003\000\002\006\004" +
    "\000\002\006\005\000\002\006\005\000\002\006\004\000" +
    "\002\006\005\000\002\006\005\000\002\006\005\000\002" +
    "\006\005\000\002\006\005\000\002\006\005\000\002\006" +
    "\005\000\002\006\005\000\002\006\005\000\002\006\005" +
    "" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\075\000\014\006\004\007\013\021\015\023\005\024" +
    "\010\001\002\000\014\006\004\007\013\021\015\023\005" +
    "\024\010\001\002\000\034\004\ufff0\005\ufff0\006\ufff0\010" +
    "\ufff0\011\ufff0\012\ufff0\013\ufff0\014\ufff0\015\ufff0\016\ufff0" +
    "\017\ufff0\020\ufff0\022\ufff0\001\002\000\016\004\ufffa\005" +
    "\054\006\055\010\057\012\056\020\053\001\002\000\016" +
    "\002\073\006\004\007\013\021\015\023\005\024\010\001" +
    "\002\000\020\004\ufff8\005\ufff8\006\ufff8\010\ufff8\012\ufff8" +
    "\020\ufff8\022\ufff8\001\002\000\032\004\ufffc\005\030\006" +
    "\020\010\032\011\027\012\024\013\026\014\022\015\021" +
    "\016\023\017\033\020\025\001\002\000\016\002\ufffd\006" +
    "\ufffd\007\ufffd\021\ufffd\023\ufffd\024\ufffd\001\002\000\012" +
    "\006\034\007\013\021\035\023\005\001\002\000\016\002" +
    "\ufffe\006\ufffe\007\ufffe\021\ufffe\023\ufffe\024\ufffe\001\002" +
    "\000\014\006\004\007\013\021\015\023\005\024\010\001" +
    "\002\000\016\005\054\006\055\010\057\012\056\020\053" +
    "\022\052\001\002\000\032\005\030\006\020\010\032\011" +
    "\027\012\024\013\026\014\022\015\021\016\023\017\033" +
    "\020\025\022\031\001\002\000\012\006\034\007\013\021" +
    "\035\023\005\001\002\000\012\006\034\007\013\021\035" +
    "\023\005\001\002\000\012\006\034\007\013\021\035\023" +
    "\005\001\002\000\012\006\034\007\013\021\035\023\005" +
    "\001\002\000\012\006\034\007\013\021\035\023\005\001" +
    "\002\000\012\006\034\007\013\021\035\023\005\001\002" +
    "\000\012\006\034\007\013\021\035\023\005\001\002\000" +
    "\012\006\034\007\013\021\035\023\005\001\002\000\012" +
    "\006\034\007\013\021\035\023\005\001\002\000\034\004" +
    "\uffe2\005\uffe2\006\uffe2\010\uffe2\011\uffe2\012\uffe2\013\uffe2" +
    "\014\uffe2\015\uffe2\016\uffe2\017\uffe2\020\uffe2\022\uffe2\001" +
    "\002\000\012\006\034\007\013\021\035\023\005\001\002" +
    "\000\012\006\034\007\013\021\035\023\005\001\002\000" +
    "\012\006\034\007\013\021\035\023\005\001\002\000\012" +
    "\006\034\007\013\021\035\023\005\001\002\000\034\004" +
    "\uffe4\005\uffe4\006\uffe4\010\uffe4\011\uffe4\012\uffe4\013\uffe4" +
    "\014\uffe4\015\uffe4\016\uffe4\017\uffe4\020\025\022\uffe4\001" +
    "\002\000\034\004\uffef\005\uffef\006\uffef\010\032\011\027" +
    "\012\024\013\026\014\022\015\021\016\023\017\033\020" +
    "\025\022\uffef\001\002\000\034\004\uffeb\005\uffeb\006\uffeb" +
    "\010\uffeb\011\uffeb\012\uffeb\013\026\014\022\015\021\016" +
    "\023\017\033\020\025\022\uffeb\001\002\000\034\004\uffee" +
    "\005\uffee\006\uffee\010\032\011\027\012\024\013\026\014" +
    "\022\015\021\016\023\017\033\020\025\022\uffee\001\002" +
    "\000\034\004\uffe9\005\uffe9\006\uffe9\010\uffe9\011\uffe9\012" +
    "\uffe9\013\026\014\022\015\021\016\023\017\033\020\025" +
    "\022\uffe9\001\002\000\034\004\uffe8\005\uffe8\006\uffe8\010" +
    "\uffe8\011\uffe8\012\uffe8\013\uffe8\014\uffe8\015\021\016\023" +
    "\017\033\020\025\022\uffe8\001\002\000\034\004\uffe3\005" +
    "\uffe3\006\uffe3\010\uffe3\011\uffe3\012\uffe3\013\uffe3\014\uffe3" +
    "\015\uffe3\016\uffe3\017\uffe3\020\uffe3\022\uffe3\001\002\000" +
    "\034\004\uffea\005\uffea\006\uffea\010\uffea\011\uffea\012\uffea" +
    "\013\026\014\022\015\021\016\023\017\033\020\025\022" +
    "\uffea\001\002\000\034\004\uffe5\005\uffe5\006\uffe5\010\uffe5" +
    "\011\uffe5\012\uffe5\013\uffe5\014\uffe5\015\uffe5\016\uffe5\017" +
    "\uffe5\020\025\022\uffe5\001\002\000\034\004\uffe7\005\uffe7" +
    "\006\uffe7\010\uffe7\011\uffe7\012\uffe7\013\uffe7\014\uffe7\015" +
    "\021\016\023\017\033\020\025\022\uffe7\001\002\000\034" +
    "\004\uffe6\005\uffe6\006\uffe6\010\uffe6\011\uffe6\012\uffe6\013" +
    "\uffe6\014\uffe6\015\uffe6\016\uffe6\017\uffe6\020\025\022\uffe6" +
    "\001\002\000\034\004\uffed\005\uffed\006\uffed\010\032\011" +
    "\027\012\024\013\026\014\022\015\021\016\023\017\033" +
    "\020\025\022\uffed\001\002\000\020\004\ufff1\005\ufff1\006" +
    "\ufff1\010\ufff1\012\ufff1\020\ufff1\022\ufff1\001\002\000\010" +
    "\006\061\021\062\024\010\001\002\000\010\006\061\021" +
    "\062\024\010\001\002\000\010\006\061\021\062\024\010" +
    "\001\002\000\010\006\061\021\062\024\010\001\002\000" +
    "\010\006\061\021\062\024\010\001\002\000\020\004\ufff4" +
    "\005\ufff4\006\ufff4\010\ufff4\012\ufff4\020\053\022\ufff4\001" +
    "\002\000\010\006\061\021\062\024\010\001\002\000\010" +
    "\006\061\021\062\024\010\001\002\000\020\004\ufff7\005" +
    "\ufff7\006\ufff7\010\057\012\056\020\053\022\ufff7\001\002" +
    "\000\020\004\ufff3\005\ufff3\006\ufff3\010\ufff3\012\ufff3\020" +
    "\053\022\ufff3\001\002\000\020\004\ufff5\005\ufff5\006\ufff5" +
    "\010\057\012\056\020\053\022\ufff5\001\002\000\020\004" +
    "\ufff6\005\ufff6\006\ufff6\010\057\012\056\020\053\022\ufff6" +
    "\001\002\000\020\004\ufff2\005\ufff2\006\ufff2\010\ufff2\012" +
    "\ufff2\020\ufff2\022\ufff2\001\002\000\034\004\uffec\005\uffec" +
    "\006\uffec\010\032\011\027\012\024\013\026\014\022\015" +
    "\021\016\023\017\033\020\025\022\uffec\001\002\000\004" +
    "\004\072\001\002\000\016\002\ufffb\006\ufffb\007\ufffb\021" +
    "\ufffb\023\ufffb\024\ufffb\001\002\000\004\002\000\001\002" +
    "\000\016\002\uffff\006\uffff\007\uffff\021\uffff\023\uffff\024" +
    "\uffff\001\002\000\016\002\001\006\001\007\001\021\001" +
    "\023\001\024\001\001\002\000\004\004\077\001\002\000" +
    "\016\002\ufff9\006\ufff9\007\ufff9\021\ufff9\023\ufff9\024\ufff9" +
    "\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\075\000\014\003\006\004\013\005\011\006\010\007" +
    "\005\001\001\000\006\006\036\007\062\001\001\000\002" +
    "\001\001\000\004\011\075\001\001\000\012\004\074\005" +
    "\073\006\010\007\005\001\001\000\002\001\001\000\004" +
    "\010\070\001\001\000\002\001\001\000\004\006\067\001" +
    "\001\000\002\001\001\000\006\006\016\007\015\001\001" +
    "\000\002\001\001\000\002\001\001\000\004\006\050\001" +
    "\001\000\004\006\047\001\001\000\004\006\046\001\001" +
    "\000\004\006\045\001\001\000\004\006\044\001\001\000" +
    "\004\006\043\001\001\000\004\006\042\001\001\000\004" +
    "\006\041\001\001\000\004\006\040\001\001\000\002\001" +
    "\001\000\004\006\037\001\001\000\004\006\035\001\001" +
    "\000\004\006\036\001\001\000\004\006\016\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\007\066\001\001\000\004\007\065\001\001\000\004" +
    "\007\064\001\001\000\004\007\063\001\001\000\004\007" +
    "\057\001\001\000\002\001\001\000\004\007\062\001\001" +
    "\000\004\007\015\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



	public static void main(String args[]) throws Exception {
		new parser(new Yylex(System.in)).parse();
	}

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$parser$actions {
  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // expr ::= LPAREN expr RPAREN 
            {
              Long RESULT = null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Long e = (Long)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT=e; 
              CUP$parser$result = new java_cup.runtime.Symbol(4/*expr*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // expr ::= expr POW expr 
            {
              Long RESULT = null;
		int lleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Long l = (Long)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int rleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int rright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		Long r = (Long)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		 RESULT=new Long((long)Math.pow(l.longValue(),r.longValue())); 
              CUP$parser$result = new java_cup.runtime.Symbol(4/*expr*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // expr ::= expr OR expr 
            {
              Long RESULT = null;
		int lleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Long l = (Long)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int rleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int rright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		Long r = (Long)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		 RESULT=new Long(l.longValue() | r.longValue()); 
              CUP$parser$result = new java_cup.runtime.Symbol(4/*expr*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // expr ::= expr XOR expr 
            {
              Long RESULT = null;
		int lleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Long l = (Long)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int rleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int rright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		Long r = (Long)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		 RESULT=new Long(l.longValue() ^ r.longValue()); 
              CUP$parser$result = new java_cup.runtime.Symbol(4/*expr*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // expr ::= expr AND expr 
            {
              Long RESULT = null;
		int lleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Long l = (Long)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int rleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int rright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		Long r = (Long)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		 RESULT=new Long(l.longValue() & r.longValue()); 
              CUP$parser$result = new java_cup.runtime.Symbol(4/*expr*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // expr ::= expr RSHIFT expr 
            {
              Long RESULT = null;
		int lleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Long l = (Long)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int rleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int rright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		Long r = (Long)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		 RESULT=new Long(l.longValue() >> r.longValue()); 
              CUP$parser$result = new java_cup.runtime.Symbol(4/*expr*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // expr ::= expr LSHIFT expr 
            {
              Long RESULT = null;
		int lleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Long l = (Long)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int rleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int rright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		Long r = (Long)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		 RESULT=new Long(l.longValue() << r.longValue()); 
              CUP$parser$result = new java_cup.runtime.Symbol(4/*expr*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // expr ::= expr MOD expr 
            {
              Long RESULT = null;
		int lleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Long l = (Long)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int rleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int rright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		Long r = (Long)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		 RESULT=new Long(l.longValue() % r.longValue()); 
              CUP$parser$result = new java_cup.runtime.Symbol(4/*expr*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // expr ::= expr DIVIDE expr 
            {
              Long RESULT = null;
		int lleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Long l = (Long)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int rleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int rright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		Long r = (Long)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		 RESULT=new Long(l.longValue() / r.longValue()); 
              CUP$parser$result = new java_cup.runtime.Symbol(4/*expr*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // expr ::= expr TIMES expr 
            {
              Long RESULT = null;
		int lleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Long l = (Long)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int rleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int rright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		Long r = (Long)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		 RESULT=new Long(l.longValue() * r.longValue()); 
              CUP$parser$result = new java_cup.runtime.Symbol(4/*expr*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // expr ::= NOT expr 
            {
              Long RESULT = null;
		int rleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int rright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		Long r = (Long)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		 RESULT=new Long(~ r.longValue()); 
              CUP$parser$result = new java_cup.runtime.Symbol(4/*expr*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // expr ::= expr MINUS expr 
            {
              Long RESULT = null;
		int lleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Long l = (Long)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int rleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int rright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		Long r = (Long)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		 RESULT=new Long(l.longValue() - r.longValue()); 
              CUP$parser$result = new java_cup.runtime.Symbol(4/*expr*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // expr ::= expr PLUS expr 
            {
              Long RESULT = null;
		int lleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Long l = (Long)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int rleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int rright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		Long r = (Long)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		 RESULT=new Long(l.longValue() + r.longValue()); 
              CUP$parser$result = new java_cup.runtime.Symbol(4/*expr*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // expr ::= MINUS expr 
            {
              Long RESULT = null;
		int rleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int rright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		Long r = (Long)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		 RESULT=new Long(0 - r.longValue()); 
              CUP$parser$result = new java_cup.runtime.Symbol(4/*expr*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // expr ::= LONG 
            {
              Long RESULT = null;
		int nleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int nright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		Long n = (Long)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		 RESULT=n; 
              CUP$parser$result = new java_cup.runtime.Symbol(4/*expr*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // exprd ::= LPAREN exprd RPAREN 
            {
              Double RESULT = null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Double e = (Double)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT=e; 
              CUP$parser$result = new java_cup.runtime.Symbol(5/*exprd*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // exprd ::= exprd POW exprd 
            {
              Double RESULT = null;
		int lleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Double l = (Double)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int rleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int rright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		Double r = (Double)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		 RESULT=new Double((double)Math.pow(l.doubleValue(),r.doubleValue())); 
              CUP$parser$result = new java_cup.runtime.Symbol(5/*exprd*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // exprd ::= exprd DIVIDE exprd 
            {
              Double RESULT = null;
		int lleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Double l = (Double)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int rleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int rright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		Double r = (Double)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		 RESULT=new Double(l.doubleValue() / r.doubleValue()); 
              CUP$parser$result = new java_cup.runtime.Symbol(5/*exprd*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // exprd ::= exprd TIMES exprd 
            {
              Double RESULT = null;
		int lleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Double l = (Double)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int rleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int rright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		Double r = (Double)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		 RESULT=new Double(l.doubleValue() * r.doubleValue()); 
              CUP$parser$result = new java_cup.runtime.Symbol(5/*exprd*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // exprd ::= exprd MINUS exprd 
            {
              Double RESULT = null;
		int lleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Double l = (Double)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int rleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int rright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		Double r = (Double)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		 RESULT=new Double(l.doubleValue() - r.doubleValue()); 
              CUP$parser$result = new java_cup.runtime.Symbol(5/*exprd*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // exprd ::= exprd PLUS exprd 
            {
              Double RESULT = null;
		int lleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Double l = (Double)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int rleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int rright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		Double r = (Double)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		 RESULT=new Double(l.doubleValue() + r.doubleValue()); 
              CUP$parser$result = new java_cup.runtime.Symbol(5/*exprd*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // exprd ::= MINUS exprd 
            {
              Double RESULT = null;
		int rleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int rright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		Double r = (Double)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		 RESULT=new Double(0 - r.doubleValue()); 
              CUP$parser$result = new java_cup.runtime.Symbol(5/*exprd*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // exprd ::= DOUBLE 
            {
              Double RESULT = null;
		int nleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int nright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		Double n = (Double)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		 RESULT=n; 
              CUP$parser$result = new java_cup.runtime.Symbol(5/*exprd*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // exprd_part ::= exprd NT$1 SEMI 
            {
              Object RESULT = null;
              // propagate RESULT from NT$1
              if ( ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value != null )
                RESULT = (Object) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Double e = (Double)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;

              CUP$parser$result = new java_cup.runtime.Symbol(3/*exprd_part*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // NT$1 ::= 
            {
              Object RESULT = null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		Double e = (Double)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
 System.out.println(" = "+e+";"); 
              CUP$parser$result = new java_cup.runtime.Symbol(7/*NT$1*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // expr_part ::= expr NT$0 SEMI 
            {
              Object RESULT = null;
              // propagate RESULT from NT$0
              if ( ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value != null )
                RESULT = (Object) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Long e = (Long)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;

              CUP$parser$result = new java_cup.runtime.Symbol(2/*expr_part*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // NT$0 ::= 
            {
              Object RESULT = null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		Long e = (Long)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
 System.out.println(" = "+e+";"); 
              CUP$parser$result = new java_cup.runtime.Symbol(6/*NT$0*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // expr_list ::= exprd_part 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(1/*expr_list*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // expr_list ::= expr_part 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(1/*expr_list*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // expr_list ::= expr_list exprd_part 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(1/*expr_list*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= expr_list EOF 
            {
              Object RESULT = null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = new java_cup.runtime.Symbol(0/*$START*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // expr_list ::= expr_list expr_part 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(1/*expr_list*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

