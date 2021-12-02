package subProj_1793

import subProj_1793.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1793")
    name = "subProj 1793"

    buildType(subProj_bt_1793_1)
    buildType(subProj_bt_1793_0)
    buildType(subProj_bt_1793_3)
    buildType(subProj_bt_1793_2)
    buildType(subProj_bt_1793_5)
    buildType(subProj_bt_1793_4)
})
