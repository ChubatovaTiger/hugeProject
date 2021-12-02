package subProj_1703

import subProj_1703.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1703")
    name = "subProj 1703"

    buildType(subProj_bt_1703_0)
    buildType(subProj_bt_1703_5)
    buildType(subProj_bt_1703_2)
    buildType(subProj_bt_1703_1)
    buildType(subProj_bt_1703_4)
    buildType(subProj_bt_1703_3)
})
