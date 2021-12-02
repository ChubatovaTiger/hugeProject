package subProj_1842

import subProj_1842.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1842")
    name = "subProj 1842"

    buildType(subProj_bt_1842_2)
    buildType(subProj_bt_1842_1)
    buildType(subProj_bt_1842_4)
    buildType(subProj_bt_1842_3)
    buildType(subProj_bt_1842_0)
    buildType(subProj_bt_1842_5)
})
