package subProj_1824

import subProj_1824.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1824")
    name = "subProj 1824"

    buildType(subProj_bt_1824_0)
    buildType(subProj_bt_1824_5)
    buildType(subProj_bt_1824_1)
    buildType(subProj_bt_1824_2)
    buildType(subProj_bt_1824_3)
    buildType(subProj_bt_1824_4)
})
