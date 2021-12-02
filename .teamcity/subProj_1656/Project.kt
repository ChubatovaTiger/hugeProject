package subProj_1656

import subProj_1656.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1656")
    name = "subProj 1656"

    buildType(subProj_bt_1656_5)
    buildType(subProj_bt_1656_4)
    buildType(subProj_bt_1656_1)
    buildType(subProj_bt_1656_0)
    buildType(subProj_bt_1656_3)
    buildType(subProj_bt_1656_2)
})
