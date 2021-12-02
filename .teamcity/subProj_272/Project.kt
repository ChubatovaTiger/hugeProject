package subProj_272

import subProj_272.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_272")
    name = "subProj 272"

    buildType(subProj_bt_272_5)
    buildType(subProj_bt_272_4)
    buildType(subProj_bt_272_3)
    buildType(subProj_bt_272_2)
    buildType(subProj_bt_272_1)
    buildType(subProj_bt_272_0)
})
