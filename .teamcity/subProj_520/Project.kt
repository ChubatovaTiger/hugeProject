package subProj_520

import subProj_520.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_520")
    name = "subProj 520"

    buildType(subProj_bt_520_0)
    buildType(subProj_bt_520_5)
    buildType(subProj_bt_520_4)
    buildType(subProj_bt_520_3)
    buildType(subProj_bt_520_2)
    buildType(subProj_bt_520_1)
})
