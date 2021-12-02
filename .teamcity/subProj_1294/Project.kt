package subProj_1294

import subProj_1294.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1294")
    name = "subProj 1294"

    buildType(subProj_bt_1294_1)
    buildType(subProj_bt_1294_0)
    buildType(subProj_bt_1294_5)
    buildType(subProj_bt_1294_4)
    buildType(subProj_bt_1294_3)
    buildType(subProj_bt_1294_2)
})
