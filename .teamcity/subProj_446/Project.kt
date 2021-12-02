package subProj_446

import subProj_446.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_446")
    name = "subProj 446"

    buildType(subProj_bt_446_0)
    buildType(subProj_bt_446_1)
    buildType(subProj_bt_446_4)
    buildType(subProj_bt_446_5)
    buildType(subProj_bt_446_2)
    buildType(subProj_bt_446_3)
})
