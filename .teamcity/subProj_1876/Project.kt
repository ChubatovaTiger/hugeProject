package subProj_1876

import subProj_1876.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1876")
    name = "subProj 1876"

    buildType(subProj_bt_1876_2)
    buildType(subProj_bt_1876_3)
    buildType(subProj_bt_1876_0)
    buildType(subProj_bt_1876_1)
    buildType(subProj_bt_1876_4)
    buildType(subProj_bt_1876_5)
})
