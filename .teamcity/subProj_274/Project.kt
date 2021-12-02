package subProj_274

import subProj_274.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_274")
    name = "subProj 274"

    buildType(subProj_bt_274_5)
    buildType(subProj_bt_274_4)
    buildType(subProj_bt_274_3)
    buildType(subProj_bt_274_2)
    buildType(subProj_bt_274_1)
    buildType(subProj_bt_274_0)
})
