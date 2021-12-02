package subProj_1945

import subProj_1945.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1945")
    name = "subProj 1945"

    buildType(subProj_bt_1945_0)
    buildType(subProj_bt_1945_4)
    buildType(subProj_bt_1945_3)
    buildType(subProj_bt_1945_2)
    buildType(subProj_bt_1945_1)
    buildType(subProj_bt_1945_5)
})
