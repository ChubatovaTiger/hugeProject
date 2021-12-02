package subProj_1218

import subProj_1218.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1218")
    name = "subProj 1218"

    buildType(subProj_bt_1218_5)
    buildType(subProj_bt_1218_4)
    buildType(subProj_bt_1218_3)
    buildType(subProj_bt_1218_2)
    buildType(subProj_bt_1218_1)
    buildType(subProj_bt_1218_0)
})
