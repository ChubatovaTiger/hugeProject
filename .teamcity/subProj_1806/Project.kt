package subProj_1806

import subProj_1806.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1806")
    name = "subProj 1806"

    buildType(subProj_bt_1806_5)
    buildType(subProj_bt_1806_0)
    buildType(subProj_bt_1806_4)
    buildType(subProj_bt_1806_3)
    buildType(subProj_bt_1806_2)
    buildType(subProj_bt_1806_1)
})
