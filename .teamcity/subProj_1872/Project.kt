package subProj_1872

import subProj_1872.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1872")
    name = "subProj 1872"

    buildType(subProj_bt_1872_4)
    buildType(subProj_bt_1872_5)
    buildType(subProj_bt_1872_2)
    buildType(subProj_bt_1872_3)
    buildType(subProj_bt_1872_0)
    buildType(subProj_bt_1872_1)
})
