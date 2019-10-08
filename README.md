IPFIX
======

This is a DFDL schema for the IPFIX format. It is portable to both IBM DFDL and Daffodil implementations of DFDL.

The folder contains the following documents:

1. doc/Parsing-IPFIX-Messages-using-DFDL.pptx 

   This Powerpoint document describes what IPFIX is,
   what it is used for, its security risks, and then
   it describes in detail the IPFIX data format.

2. doc/Issues-to-Address-when-Using-DFDL-to-Parse-IPFIX-messages.docx

   This Word document describes the need to dynamically
   generate the parser for IPFIX data records.

3. src/main/resources/org/mitre/ipfix/template-record.dfdl.xsd

   This is a DFDL schema for parsing IPFIX template records.

4. src/test/resources/org/mitre/ipfix/template-record.binary

   This is a sample IPFIX message containing a template record.

5. src/test/resources/org/mitre/ipfix/template-record.xml

   This XML is the result of parsing (4) using (3).

6. src/main/resources/org/mitre/ipfix/data-record.dfdl.xsd

   This is a DFDL schema for parsing IPFIX data records. The
   content of this data record is described by the template record
   in (3).

7. src/test/resources/org/mitre/ipfix/data-record.binary

   This is a sample IPFIX message containing a data record.

8. src/test/resources/org/mitre/ipfix/data-record.xml

   This XML is the result of parsing (7) using (6).


Roger Costello
May 7, 2015
