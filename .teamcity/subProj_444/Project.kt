package subProj_444

import subProj_444.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_444")
    name = "subProj 444"

    buildType(subProj_bt_444_2)
    buildType(subProj_bt_444_3)
    buildType(subProj_bt_444_0)
    buildType(subProj_bt_444_1)
    buildType(subProj_bt_444_4)
    buildType(subProj_bt_444_5)
})
