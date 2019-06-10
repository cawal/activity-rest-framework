<?xml version = '1.0' encoding = 'ISO-8859-1' ?>
<asm version="1.0" name="0">
	<cp>
		<constant value="aadl2openAPI"/>
		<constant value="links"/>
		<constant value="NTransientLinkSet;"/>
		<constant value="col"/>
		<constant value="J"/>
		<constant value="main"/>
		<constant value="A"/>
		<constant value="OclParametrizedType"/>
		<constant value="#native"/>
		<constant value="Collection"/>
		<constant value="J.setName(S):V"/>
		<constant value="OclSimpleType"/>
		<constant value="OclAny"/>
		<constant value="J.setElementType(J):V"/>
		<constant value="TransientLinkSet"/>
		<constant value="A.__matcher__():V"/>
		<constant value="A.__exec__():V"/>
		<constant value="self"/>
		<constant value="__resolve__"/>
		<constant value="1"/>
		<constant value="J.oclIsKindOf(J):B"/>
		<constant value="18"/>
		<constant value="NTransientLinkSet;.getLinkBySourceElement(S):QNTransientLink;"/>
		<constant value="J.oclIsUndefined():B"/>
		<constant value="15"/>
		<constant value="NTransientLink;.getTargetFromSource(J):J"/>
		<constant value="17"/>
		<constant value="30"/>
		<constant value="Sequence"/>
		<constant value="2"/>
		<constant value="A.__resolve__(J):J"/>
		<constant value="QJ.including(J):QJ"/>
		<constant value="QJ.flatten():QJ"/>
		<constant value="e"/>
		<constant value="value"/>
		<constant value="resolveTemp"/>
		<constant value="S"/>
		<constant value="NTransientLink;.getNamedTargetFromSource(JS):J"/>
		<constant value="name"/>
		<constant value="__matcher__"/>
		<constant value="A.__matchActivity():V"/>
		<constant value="__exec__"/>
		<constant value="Activity"/>
		<constant value="NTransientLinkSet;.getLinksByRule(S):QNTransientLink;"/>
		<constant value="A.__applyActivity(NTransientLink;):V"/>
		<constant value="host"/>
		<constant value="http/kode.ffclrp.usp.br"/>
		<constant value="8:33-8:58"/>
		<constant value="port"/>
		<constant value="8081"/>
		<constant value="9:33-9:37"/>
		<constant value="basePath"/>
		<constant value="J.host():J"/>
		<constant value=":"/>
		<constant value="J.+(J):J"/>
		<constant value="J.port():J"/>
		<constant value="/"/>
		<constant value="11:4-11:14"/>
		<constant value="11:4-11:21"/>
		<constant value="11:24-11:27"/>
		<constant value="11:4-11:27"/>
		<constant value="12:3-12:13"/>
		<constant value="12:3-12:20"/>
		<constant value="11:4-12:20"/>
		<constant value="12:23-12:26"/>
		<constant value="11:4-12:26"/>
		<constant value="12:29-12:33"/>
		<constant value="11:4-12:33"/>
		<constant value="path"/>
		<constant value="__matchActivity"/>
		<constant value="aadl"/>
		<constant value="IN"/>
		<constant value="MMOF!Classifier;.allInstancesFrom(S):QJ"/>
		<constant value="TransientLink"/>
		<constant value="NTransientLink;.setRule(MATL!Rule;):V"/>
		<constant value="activity"/>
		<constant value="NTransientLink;.addSourceElement(SJ):V"/>
		<constant value="root"/>
		<constant value="Root"/>
		<constant value="openapi"/>
		<constant value="NTransientLink;.addTargetElement(SJ):V"/>
		<constant value="schema"/>
		<constant value="Schema"/>
		<constant value="api"/>
		<constant value="API"/>
		<constant value="NTransientLinkSet;.addLink2(NTransientLink;B):V"/>
		<constant value="20:3-25:4"/>
		<constant value="26:3-29:4"/>
		<constant value="30:3-37:4"/>
		<constant value="__applyActivity"/>
		<constant value="NTransientLink;"/>
		<constant value="NTransientLink;.getSourceElement(S):J"/>
		<constant value="NTransientLink;.getTargetElement(S):J"/>
		<constant value="3"/>
		<constant value="4"/>
		<constant value="5"/>
		<constant value="schemas"/>
		<constant value="QJ.first():J"/>
		<constant value="paramters"/>
		<constant value="responses"/>
		<constant value="title"/>
		<constant value="remark"/>
		<constant value="description"/>
		<constant value="2.0"/>
		<constant value="swagger"/>
		<constant value="J.basePath(J):J"/>
		<constant value="application/json"/>
		<constant value="consumes"/>
		<constant value="application/xml"/>
		<constant value="produces"/>
		<constant value="21:15-21:21"/>
		<constant value="21:4-21:21"/>
		<constant value="22:10-22:13"/>
		<constant value="22:4-22:13"/>
		<constant value="23:17-23:29"/>
		<constant value="23:4-23:29"/>
		<constant value="24:17-24:29"/>
		<constant value="24:4-24:29"/>
		<constant value="27:13-27:21"/>
		<constant value="27:13-27:26"/>
		<constant value="27:4-27:26"/>
		<constant value="28:19-28:27"/>
		<constant value="28:19-28:34"/>
		<constant value="28:4-28:34"/>
		<constant value="31:15-31:20"/>
		<constant value="31:4-31:20"/>
		<constant value="32:16-32:26"/>
		<constant value="32:36-32:44"/>
		<constant value="32:36-32:49"/>
		<constant value="32:16-32:50"/>
		<constant value="32:4-32:50"/>
		<constant value="33:16-33:34"/>
		<constant value="33:4-33:34"/>
		<constant value="34:16-34:33"/>
		<constant value="34:4-34:33"/>
		<constant value="35:16-35:34"/>
		<constant value="35:4-35:34"/>
		<constant value="36:16-36:33"/>
		<constant value="36:4-36:33"/>
		<constant value="38:2-39:3"/>
		<constant value="link"/>
	</cp>
	<field name="1" type="2"/>
	<field name="3" type="4"/>
	<operation name="5">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<getasm/>
			<push arg="7"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="9"/>
			<pcall arg="10"/>
			<dup/>
			<push arg="11"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="12"/>
			<pcall arg="10"/>
			<pcall arg="13"/>
			<set arg="3"/>
			<getasm/>
			<push arg="14"/>
			<push arg="8"/>
			<new/>
			<set arg="1"/>
			<getasm/>
			<pcall arg="15"/>
			<getasm/>
			<pcall arg="16"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="17" begin="0" end="24"/>
		</localvariabletable>
	</operation>
	<operation name="18">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="4"/>
		</parameters>
		<code>
			<load arg="19"/>
			<getasm/>
			<get arg="3"/>
			<call arg="20"/>
			<if arg="21"/>
			<getasm/>
			<get arg="1"/>
			<load arg="19"/>
			<call arg="22"/>
			<dup/>
			<call arg="23"/>
			<if arg="24"/>
			<load arg="19"/>
			<call arg="25"/>
			<goto arg="26"/>
			<pop/>
			<load arg="19"/>
			<goto arg="27"/>
			<push arg="28"/>
			<push arg="8"/>
			<new/>
			<load arg="19"/>
			<iterate/>
			<store arg="29"/>
			<getasm/>
			<load arg="29"/>
			<call arg="30"/>
			<call arg="31"/>
			<enditerate/>
			<call arg="32"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="2" name="33" begin="23" end="27"/>
			<lve slot="0" name="17" begin="0" end="29"/>
			<lve slot="1" name="34" begin="0" end="29"/>
		</localvariabletable>
	</operation>
	<operation name="35">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="4"/>
			<parameter name="29" type="36"/>
		</parameters>
		<code>
			<getasm/>
			<get arg="1"/>
			<load arg="19"/>
			<call arg="22"/>
			<load arg="19"/>
			<load arg="29"/>
			<call arg="37"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="17" begin="0" end="6"/>
			<lve slot="1" name="34" begin="0" end="6"/>
			<lve slot="2" name="38" begin="0" end="6"/>
		</localvariabletable>
	</operation>
	<operation name="39">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<getasm/>
			<pcall arg="40"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="17" begin="0" end="1"/>
		</localvariabletable>
	</operation>
	<operation name="41">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<getasm/>
			<get arg="1"/>
			<push arg="42"/>
			<call arg="43"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<load arg="19"/>
			<pcall arg="44"/>
			<enditerate/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="33" begin="5" end="8"/>
			<lve slot="0" name="17" begin="0" end="9"/>
		</localvariabletable>
	</operation>
	<operation name="45">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<push arg="46"/>
		</code>
		<linenumbertable>
			<lne id="47" begin="0" end="0"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="17" begin="0" end="0"/>
		</localvariabletable>
	</operation>
	<operation name="48">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<pushi arg="49"/>
		</code>
		<linenumbertable>
			<lne id="50" begin="0" end="0"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="17" begin="0" end="0"/>
		</localvariabletable>
	</operation>
	<operation name="51">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="4"/>
		</parameters>
		<code>
			<getasm/>
			<call arg="52"/>
			<push arg="53"/>
			<call arg="54"/>
			<getasm/>
			<call arg="55"/>
			<call arg="54"/>
			<push arg="56"/>
			<call arg="54"/>
			<load arg="19"/>
			<call arg="54"/>
		</code>
		<linenumbertable>
			<lne id="57" begin="0" end="0"/>
			<lne id="58" begin="0" end="1"/>
			<lne id="59" begin="2" end="2"/>
			<lne id="60" begin="0" end="3"/>
			<lne id="61" begin="4" end="4"/>
			<lne id="62" begin="4" end="5"/>
			<lne id="63" begin="0" end="6"/>
			<lne id="64" begin="7" end="7"/>
			<lne id="65" begin="0" end="8"/>
			<lne id="66" begin="9" end="9"/>
			<lne id="67" begin="0" end="10"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="17" begin="0" end="10"/>
			<lve slot="1" name="68" begin="0" end="10"/>
		</localvariabletable>
	</operation>
	<operation name="69">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<push arg="42"/>
			<push arg="70"/>
			<findme/>
			<push arg="71"/>
			<call arg="72"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<get arg="1"/>
			<push arg="73"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="42"/>
			<pcall arg="74"/>
			<dup/>
			<push arg="75"/>
			<load arg="19"/>
			<pcall arg="76"/>
			<dup/>
			<push arg="77"/>
			<push arg="78"/>
			<push arg="79"/>
			<new/>
			<pcall arg="80"/>
			<dup/>
			<push arg="81"/>
			<push arg="82"/>
			<push arg="79"/>
			<new/>
			<pcall arg="80"/>
			<dup/>
			<push arg="83"/>
			<push arg="84"/>
			<push arg="79"/>
			<new/>
			<pcall arg="80"/>
			<pusht/>
			<pcall arg="85"/>
			<enditerate/>
		</code>
		<linenumbertable>
			<lne id="86" begin="19" end="24"/>
			<lne id="87" begin="25" end="30"/>
			<lne id="88" begin="31" end="36"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="75" begin="6" end="38"/>
			<lve slot="0" name="17" begin="0" end="39"/>
		</localvariabletable>
	</operation>
	<operation name="89">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="90"/>
		</parameters>
		<code>
			<load arg="19"/>
			<push arg="75"/>
			<call arg="91"/>
			<store arg="29"/>
			<load arg="19"/>
			<push arg="77"/>
			<call arg="92"/>
			<store arg="93"/>
			<load arg="19"/>
			<push arg="81"/>
			<call arg="92"/>
			<store arg="94"/>
			<load arg="19"/>
			<push arg="83"/>
			<call arg="92"/>
			<store arg="95"/>
			<load arg="93"/>
			<dup/>
			<getasm/>
			<load arg="94"/>
			<call arg="30"/>
			<set arg="96"/>
			<dup/>
			<getasm/>
			<load arg="95"/>
			<call arg="30"/>
			<set arg="83"/>
			<dup/>
			<getasm/>
			<push arg="28"/>
			<push arg="8"/>
			<new/>
			<call arg="97"/>
			<call arg="30"/>
			<set arg="98"/>
			<dup/>
			<getasm/>
			<push arg="28"/>
			<push arg="8"/>
			<new/>
			<call arg="97"/>
			<call arg="30"/>
			<set arg="99"/>
			<pop/>
			<load arg="94"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="38"/>
			<call arg="30"/>
			<set arg="100"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="101"/>
			<call arg="30"/>
			<set arg="102"/>
			<pop/>
			<load arg="95"/>
			<dup/>
			<getasm/>
			<push arg="103"/>
			<call arg="30"/>
			<set arg="104"/>
			<dup/>
			<getasm/>
			<getasm/>
			<load arg="29"/>
			<get arg="38"/>
			<call arg="105"/>
			<call arg="30"/>
			<set arg="51"/>
			<dup/>
			<getasm/>
			<push arg="106"/>
			<call arg="30"/>
			<set arg="107"/>
			<dup/>
			<getasm/>
			<push arg="108"/>
			<call arg="30"/>
			<set arg="107"/>
			<dup/>
			<getasm/>
			<push arg="106"/>
			<call arg="30"/>
			<set arg="109"/>
			<dup/>
			<getasm/>
			<push arg="108"/>
			<call arg="30"/>
			<set arg="109"/>
			<pop/>
		</code>
		<linenumbertable>
			<lne id="110" begin="19" end="19"/>
			<lne id="111" begin="17" end="21"/>
			<lne id="112" begin="24" end="24"/>
			<lne id="113" begin="22" end="26"/>
			<lne id="114" begin="29" end="32"/>
			<lne id="115" begin="27" end="34"/>
			<lne id="116" begin="37" end="40"/>
			<lne id="117" begin="35" end="42"/>
			<lne id="86" begin="16" end="43"/>
			<lne id="118" begin="47" end="47"/>
			<lne id="119" begin="47" end="48"/>
			<lne id="120" begin="45" end="50"/>
			<lne id="121" begin="53" end="53"/>
			<lne id="122" begin="53" end="54"/>
			<lne id="123" begin="51" end="56"/>
			<lne id="87" begin="44" end="57"/>
			<lne id="124" begin="61" end="61"/>
			<lne id="125" begin="59" end="63"/>
			<lne id="126" begin="66" end="66"/>
			<lne id="127" begin="67" end="67"/>
			<lne id="128" begin="67" end="68"/>
			<lne id="129" begin="66" end="69"/>
			<lne id="130" begin="64" end="71"/>
			<lne id="131" begin="74" end="74"/>
			<lne id="132" begin="72" end="76"/>
			<lne id="133" begin="79" end="79"/>
			<lne id="134" begin="77" end="81"/>
			<lne id="135" begin="84" end="84"/>
			<lne id="136" begin="82" end="86"/>
			<lne id="137" begin="89" end="89"/>
			<lne id="138" begin="87" end="91"/>
			<lne id="88" begin="58" end="92"/>
			<lne id="139" begin="93" end="92"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="3" name="77" begin="7" end="92"/>
			<lve slot="4" name="81" begin="11" end="92"/>
			<lve slot="5" name="83" begin="15" end="92"/>
			<lve slot="2" name="75" begin="3" end="92"/>
			<lve slot="0" name="17" begin="0" end="92"/>
			<lve slot="1" name="140" begin="0" end="92"/>
		</localvariabletable>
	</operation>
</asm>
