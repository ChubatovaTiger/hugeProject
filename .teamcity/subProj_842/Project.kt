package subProj_842

import subProj_842.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_842")
    name = "subProj 842"

    buildType(subProj_bt_842_0)
    buildType(subProj_bt_842_1)
    buildType(subProj_bt_842_4)
    buildType(subProj_bt_842_5)
    buildType(subProj_bt_842_2)
    buildType(subProj_bt_842_3)
})
