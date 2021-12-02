package subProj_872

import subProj_872.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_872")
    name = "subProj 872"

    buildType(subProj_bt_872_0)
    buildType(subProj_bt_872_4)
    buildType(subProj_bt_872_3)
    buildType(subProj_bt_872_2)
    buildType(subProj_bt_872_1)
    buildType(subProj_bt_872_5)
})
