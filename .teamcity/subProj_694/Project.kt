package subProj_694

import subProj_694.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_694")
    name = "subProj 694"

    buildType(subProj_bt_694_3)
    buildType(subProj_bt_694_4)
    buildType(subProj_bt_694_5)
    buildType(subProj_bt_694_0)
    buildType(subProj_bt_694_1)
    buildType(subProj_bt_694_2)
})
