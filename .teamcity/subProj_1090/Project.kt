package subProj_1090

import subProj_1090.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1090")
    name = "subProj 1090"

    buildType(subProj_bt_1090_2)
    buildType(subProj_bt_1090_3)
    buildType(subProj_bt_1090_0)
    buildType(subProj_bt_1090_1)
    buildType(subProj_bt_1090_4)
    buildType(subProj_bt_1090_5)
})
