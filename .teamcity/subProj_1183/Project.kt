package subProj_1183

import subProj_1183.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1183")
    name = "subProj 1183"

    buildType(subProj_bt_1183_3)
    buildType(subProj_bt_1183_4)
    buildType(subProj_bt_1183_5)
    buildType(subProj_bt_1183_0)
    buildType(subProj_bt_1183_1)
    buildType(subProj_bt_1183_2)
})
