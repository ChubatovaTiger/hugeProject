package subProj_1665

import subProj_1665.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1665")
    name = "subProj 1665"

    buildType(subProj_bt_1665_0)
    buildType(subProj_bt_1665_1)
    buildType(subProj_bt_1665_4)
    buildType(subProj_bt_1665_5)
    buildType(subProj_bt_1665_2)
    buildType(subProj_bt_1665_3)
})
