package subProj_1158

import subProj_1158.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1158")
    name = "subProj 1158"

    buildType(subProj_bt_1158_2)
    buildType(subProj_bt_1158_1)
    buildType(subProj_bt_1158_0)
    buildType(subProj_bt_1158_5)
    buildType(subProj_bt_1158_4)
    buildType(subProj_bt_1158_3)
})
