package subProj_1272

import subProj_1272.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1272")
    name = "subProj 1272"

    buildType(subProj_bt_1272_0)
    buildType(subProj_bt_1272_1)
    buildType(subProj_bt_1272_4)
    buildType(subProj_bt_1272_5)
    buildType(subProj_bt_1272_2)
    buildType(subProj_bt_1272_3)
})
