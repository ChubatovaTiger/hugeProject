package subProj_1239

import subProj_1239.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1239")
    name = "subProj 1239"

    buildType(subProj_bt_1239_0)
    buildType(subProj_bt_1239_1)
    buildType(subProj_bt_1239_2)
    buildType(subProj_bt_1239_3)
    buildType(subProj_bt_1239_4)
    buildType(subProj_bt_1239_5)
})
