package subProj_1761

import subProj_1761.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1761")
    name = "subProj 1761"

    buildType(subProj_bt_1761_0)
    buildType(subProj_bt_1761_1)
    buildType(subProj_bt_1761_2)
    buildType(subProj_bt_1761_3)
    buildType(subProj_bt_1761_4)
    buildType(subProj_bt_1761_5)
})
