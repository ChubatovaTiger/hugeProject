package subProj_1849

import subProj_1849.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1849")
    name = "subProj 1849"

    buildType(subProj_bt_1849_3)
    buildType(subProj_bt_1849_2)
    buildType(subProj_bt_1849_5)
    buildType(subProj_bt_1849_4)
    buildType(subProj_bt_1849_1)
    buildType(subProj_bt_1849_0)
})
