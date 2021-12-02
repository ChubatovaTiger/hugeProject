package subProj_719

import subProj_719.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_719")
    name = "subProj 719"

    buildType(subProj_bt_719_0)
    buildType(subProj_bt_719_4)
    buildType(subProj_bt_719_3)
    buildType(subProj_bt_719_2)
    buildType(subProj_bt_719_1)
    buildType(subProj_bt_719_5)
})
