package subProj_1494

import subProj_1494.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1494")
    name = "subProj 1494"

    buildType(subProj_bt_1494_3)
    buildType(subProj_bt_1494_2)
    buildType(subProj_bt_1494_1)
    buildType(subProj_bt_1494_0)
    buildType(subProj_bt_1494_5)
    buildType(subProj_bt_1494_4)
})
