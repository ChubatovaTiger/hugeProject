package subProj_1520

import subProj_1520.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1520")
    name = "subProj 1520"

    buildType(subProj_bt_1520_2)
    buildType(subProj_bt_1520_3)
    buildType(subProj_bt_1520_0)
    buildType(subProj_bt_1520_1)
    buildType(subProj_bt_1520_4)
    buildType(subProj_bt_1520_5)
})
