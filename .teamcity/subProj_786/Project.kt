package subProj_786

import subProj_786.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_786")
    name = "subProj 786"

    buildType(subProj_bt_786_5)
    buildType(subProj_bt_786_3)
    buildType(subProj_bt_786_4)
    buildType(subProj_bt_786_1)
    buildType(subProj_bt_786_2)
    buildType(subProj_bt_786_0)
})
