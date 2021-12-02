package subProj_1105

import subProj_1105.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1105")
    name = "subProj 1105"

    buildType(subProj_bt_1105_0)
    buildType(subProj_bt_1105_2)
    buildType(subProj_bt_1105_1)
    buildType(subProj_bt_1105_4)
    buildType(subProj_bt_1105_3)
    buildType(subProj_bt_1105_5)
})
