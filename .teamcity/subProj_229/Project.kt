package subProj_229

import subProj_229.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_229")
    name = "subProj 229"

    buildType(subProj_bt_229_0)
    buildType(subProj_bt_229_2)
    buildType(subProj_bt_229_1)
    buildType(subProj_bt_229_4)
    buildType(subProj_bt_229_3)
    buildType(subProj_bt_229_5)
})
