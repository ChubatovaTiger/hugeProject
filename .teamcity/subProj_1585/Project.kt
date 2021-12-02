package subProj_1585

import subProj_1585.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1585")
    name = "subProj 1585"

    buildType(subProj_bt_1585_0)
    buildType(subProj_bt_1585_5)
    buildType(subProj_bt_1585_2)
    buildType(subProj_bt_1585_1)
    buildType(subProj_bt_1585_4)
    buildType(subProj_bt_1585_3)
})
