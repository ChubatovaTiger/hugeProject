package subProj_529

import subProj_529.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_529")
    name = "subProj 529"

    buildType(subProj_bt_529_5)
    buildType(subProj_bt_529_4)
    buildType(subProj_bt_529_3)
    buildType(subProj_bt_529_2)
    buildType(subProj_bt_529_1)
    buildType(subProj_bt_529_0)
})
