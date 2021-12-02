package subProj_793

import subProj_793.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_793")
    name = "subProj 793"

    buildType(subProj_bt_793_1)
    buildType(subProj_bt_793_2)
    buildType(subProj_bt_793_0)
    buildType(subProj_bt_793_5)
    buildType(subProj_bt_793_3)
    buildType(subProj_bt_793_4)
})
