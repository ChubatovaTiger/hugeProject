package subProj_1821

import subProj_1821.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1821")
    name = "subProj 1821"

    buildType(subProj_bt_1821_0)
    buildType(subProj_bt_1821_1)
    buildType(subProj_bt_1821_2)
    buildType(subProj_bt_1821_3)
    buildType(subProj_bt_1821_4)
    buildType(subProj_bt_1821_5)
})
