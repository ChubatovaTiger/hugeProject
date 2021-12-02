package subProj_1789

import subProj_1789.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1789")
    name = "subProj 1789"

    buildType(subProj_bt_1789_4)
    buildType(subProj_bt_1789_3)
    buildType(subProj_bt_1789_5)
    buildType(subProj_bt_1789_0)
    buildType(subProj_bt_1789_2)
    buildType(subProj_bt_1789_1)
})
