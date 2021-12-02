package subProj_1606

import subProj_1606.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1606")
    name = "subProj 1606"

    buildType(subProj_bt_1606_5)
    buildType(subProj_bt_1606_4)
    buildType(subProj_bt_1606_3)
    buildType(subProj_bt_1606_2)
    buildType(subProj_bt_1606_1)
    buildType(subProj_bt_1606_0)
})
