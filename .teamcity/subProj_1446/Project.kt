package subProj_1446

import subProj_1446.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1446")
    name = "subProj 1446"

    buildType(subProj_bt_1446_5)
    buildType(subProj_bt_1446_2)
    buildType(subProj_bt_1446_1)
    buildType(subProj_bt_1446_4)
    buildType(subProj_bt_1446_3)
    buildType(subProj_bt_1446_0)
})
