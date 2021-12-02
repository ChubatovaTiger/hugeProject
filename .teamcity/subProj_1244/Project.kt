package subProj_1244

import subProj_1244.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1244")
    name = "subProj 1244"

    buildType(subProj_bt_1244_1)
    buildType(subProj_bt_1244_2)
    buildType(subProj_bt_1244_3)
    buildType(subProj_bt_1244_4)
    buildType(subProj_bt_1244_5)
    buildType(subProj_bt_1244_0)
})
