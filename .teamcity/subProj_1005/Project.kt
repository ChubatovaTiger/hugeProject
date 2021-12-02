package subProj_1005

import subProj_1005.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1005")
    name = "subProj 1005"

    buildType(subProj_bt_1005_0)
    buildType(subProj_bt_1005_1)
    buildType(subProj_bt_1005_4)
    buildType(subProj_bt_1005_5)
    buildType(subProj_bt_1005_2)
    buildType(subProj_bt_1005_3)
})
