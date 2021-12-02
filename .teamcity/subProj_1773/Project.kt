package subProj_1773

import subProj_1773.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1773")
    name = "subProj 1773"

    buildType(subProj_bt_1773_0)
    buildType(subProj_bt_1773_1)
    buildType(subProj_bt_1773_2)
    buildType(subProj_bt_1773_3)
    buildType(subProj_bt_1773_4)
    buildType(subProj_bt_1773_5)
})
