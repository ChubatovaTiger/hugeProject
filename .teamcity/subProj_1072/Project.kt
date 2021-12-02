package subProj_1072

import subProj_1072.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1072")
    name = "subProj 1072"

    buildType(subProj_bt_1072_4)
    buildType(subProj_bt_1072_5)
    buildType(subProj_bt_1072_2)
    buildType(subProj_bt_1072_3)
    buildType(subProj_bt_1072_0)
    buildType(subProj_bt_1072_1)
})
