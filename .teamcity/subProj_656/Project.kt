package subProj_656

import subProj_656.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_656")
    name = "subProj 656"

    buildType(subProj_bt_656_5)
    buildType(subProj_bt_656_3)
    buildType(subProj_bt_656_4)
    buildType(subProj_bt_656_1)
    buildType(subProj_bt_656_2)
    buildType(subProj_bt_656_0)
})
