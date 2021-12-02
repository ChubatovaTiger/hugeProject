package subProj_1694

import subProj_1694.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1694")
    name = "subProj 1694"

    buildType(subProj_bt_1694_1)
    buildType(subProj_bt_1694_0)
    buildType(subProj_bt_1694_5)
    buildType(subProj_bt_1694_4)
    buildType(subProj_bt_1694_3)
    buildType(subProj_bt_1694_2)
})
