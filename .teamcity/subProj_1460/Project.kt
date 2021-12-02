package subProj_1460

import subProj_1460.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1460")
    name = "subProj 1460"

    buildType(subProj_bt_1460_2)
    buildType(subProj_bt_1460_1)
    buildType(subProj_bt_1460_4)
    buildType(subProj_bt_1460_3)
    buildType(subProj_bt_1460_0)
    buildType(subProj_bt_1460_5)
})
