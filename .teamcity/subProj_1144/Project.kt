package subProj_1144

import subProj_1144.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1144")
    name = "subProj 1144"

    buildType(subProj_bt_1144_4)
    buildType(subProj_bt_1144_5)
    buildType(subProj_bt_1144_2)
    buildType(subProj_bt_1144_3)
    buildType(subProj_bt_1144_0)
    buildType(subProj_bt_1144_1)
})
