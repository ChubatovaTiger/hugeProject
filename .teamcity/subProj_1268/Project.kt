package subProj_1268

import subProj_1268.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1268")
    name = "subProj 1268"

    buildType(subProj_bt_1268_0)
    buildType(subProj_bt_1268_2)
    buildType(subProj_bt_1268_1)
    buildType(subProj_bt_1268_4)
    buildType(subProj_bt_1268_3)
    buildType(subProj_bt_1268_5)
})
