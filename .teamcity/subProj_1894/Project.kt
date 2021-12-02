package subProj_1894

import subProj_1894.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1894")
    name = "subProj 1894"

    buildType(subProj_bt_1894_5)
    buildType(subProj_bt_1894_4)
    buildType(subProj_bt_1894_3)
    buildType(subProj_bt_1894_2)
    buildType(subProj_bt_1894_1)
    buildType(subProj_bt_1894_0)
})
