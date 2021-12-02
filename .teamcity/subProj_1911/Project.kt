package subProj_1911

import subProj_1911.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1911")
    name = "subProj 1911"

    buildType(subProj_bt_1911_0)
    buildType(subProj_bt_1911_1)
    buildType(subProj_bt_1911_4)
    buildType(subProj_bt_1911_5)
    buildType(subProj_bt_1911_2)
    buildType(subProj_bt_1911_3)
})
