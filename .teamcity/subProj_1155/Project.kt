package subProj_1155

import subProj_1155.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1155")
    name = "subProj 1155"

    buildType(subProj_bt_1155_5)
    buildType(subProj_bt_1155_4)
    buildType(subProj_bt_1155_3)
    buildType(subProj_bt_1155_2)
    buildType(subProj_bt_1155_1)
    buildType(subProj_bt_1155_0)
})
